package blood.transfusion.contoller;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.BTProjectDAO;
import blood.transfusion.model.BTService;
import blood.transfusion.model.DonorDAO;
import blood.transfusion.view.RunningEndView;
import blood.transfusion.view.RunningSuccessView;

public class BTController {
	private static BTController instance = new BTController();
	private BTService service = BTService.getInstance();

	private BTController() {
	}

	public static BTController getInstance() {
		return instance;
	}

	// 모든 프로젝트 검색
	public void allBTProjects() {
		try {
			RunningEndView.projectListView(service.getAllBTProjects());
			RunningSuccessView.showSuccess("모든 프로젝트 검색 성공");
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든 프로젝트 검색시 에러 발생");
		}

	}

	// 특정 프로젝트 검색
	public void btProjectGetByName(String btProjectName) {
		try {
			RunningEndView.projectView(service.getBTProject(btProjectName));

			RunningSuccessView.showSuccess("프로젝트 검색 성공");
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("프로젝트 검색시 에러 발생");
		} catch (NotExistException e) {
			e.printStackTrace();
		}

	}

	// 새로운 프로젝트 저장 로직
	public void insertBTProject(BTProjectDTO btProject) {
		try {
			service.addDonor(new DonorDTO("donor4", "헌혈4", 25, "F", "AB-", "검사"));
			service.addRecipient(new RecipientDTO("recipient4", "수혈4", 25, "M", "AB-", "질병"));
			service.addBTProject(btProject);

			RunningSuccessView.showSuccess("새로운 프로젝트 저장 성공");
		} catch (SQLException e) {
			e.printStackTrace();
			RunningEndView.showError("새로운 프로젝트 저장 실패");
		}

	}

	// 특정 프로젝트 업데이트
	public void updateProject(String btProjectName, String btProjectContent) {
		try {
			service.updateBTProject(btProjectName, btProjectContent);

			RunningSuccessView.showSuccess("업데이트 성공");
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (NotExistException e) {
			e.printStackTrace();
			RunningEndView.showError("업데이트 실패");
		}
	}

	// 특정 프로젝트 삭제
	public void deleteProject(String btProjectName) {
		BTProjectDTO project = null;
		try {
			project = service.getBTProject(btProjectName);
			service.deleteBTProject(btProjectName);
			service.deleteDonor(project.getDonorId());
			service.deleteRecipient(project.getRecipientId());
			RunningSuccessView.showSuccess("프로젝트 삭제 완료");
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (NotExistException e) {
			e.printStackTrace();
			RunningEndView.showError("프로젝트 삭제 실패");
		}

	}

	// 모든 헌혈자 검색 로직
	public static ArrayList<DonorDTO> getAllDonors() {
		ArrayList<DonorDTO> allProject = null;
		try {
			RunningEndView.projectListView(DonorDAO.getAllDonors());
			RunningSuccessView.showSuccess("모든  헌혈자 검색 성공");
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든  헌혈자 검색시 에러 발생");
		}
		return allProject;
	}

}
