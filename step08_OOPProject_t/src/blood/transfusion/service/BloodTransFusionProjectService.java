package blood.transfusion.service;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.Donor;
import blood.transfusion.dto.People;
import blood.transfusion.dto.Recipient;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.BloodTransfusionVirtualDB;

public class BloodTransFusionProjectService {
	private static BloodTransFusionProjectService instance = new BloodTransFusionProjectService();
	private BloodTransfusionVirtualDB projectVirtualData = BloodTransfusionVirtualDB.getInstance();

	private BloodTransFusionProjectService() {
	}

	public static BloodTransFusionProjectService getInstance() {
		return instance;
	}

	// 모든 프로젝트 반환
	public ArrayList<BloodTransfusionProject> getAllProjects() {
		return projectVirtualData.getProjectList();
	}

	// 프로젝트 검색_
	public BloodTransfusionProject getProject(String projectName) throws NotExistException {
		BloodTransfusionProject project = null;
		ArrayList<BloodTransfusionProject> allProjects = getAllProjects();
		for (int i = 0; i < allProjects.size(); i++) {
			if (allProjects.get(i).getBtProjectName().equals(projectName)) {
				project = allProjects.get(i);

				return project;
			}
		}
		throw new NotExistException("검색 요청하신 프로젝트는 존재하지 않습니다");
	}

	// 새로운 프로젝트 추가
	public void projectInsert(BloodTransfusionProject newProject) {
		projectVirtualData.insertProject(newProject);
	}

	// 프로젝트 수정 - 프로젝트 명으로 현혈자 혹은 수혈자 수정_
	public void projectUpdate(String projectName, People people) throws NotExistException {
		ArrayList<BloodTransfusionProject> allProjects = getAllProjects();
		int check = 0;
		for (int i = 0; i < allProjects.size(); i++) {
			if (projectName.equals(allProjects.get(i).getBtProjectName())) {
				if (people instanceof Recipient) {
					allProjects.get(i).setRecipient((Recipient) people);
					check = 1;
				} else if (people instanceof Donor) {
					allProjects.get(i).setDonor((Donor) people);
					check = 1;
				}
			}

		}
		if (check == 0) {
			throw new NotExistException("수정하고자 하는 Project가 존재하지 않습니다");
		}
	}

	// 프로젝트 삭제_
	public void projectDelete(String projectName) throws NotExistException {
		BloodTransfusionProject project = null;

		ArrayList<BloodTransfusionProject> allProjects = getAllProjects();
		for (int i = 0; i < allProjects.size(); i++) {
			if (allProjects.get(i).getBtProjectName().equals(projectName)) {
				project = allProjects.get(i);
				getAllProjects().remove(project);
				System.out.println("해당 Project가 삭제되었습니다");

			}
		}
		if (project == null) {
			throw new NotExistException("삭제 실패");
		}
	}
}
