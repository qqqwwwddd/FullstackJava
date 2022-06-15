package blood.transfusion.view;

import blood.transfusion.contoller.BTController;
import blood.transfusion.dto.BTProjectDTO;

public class RunningStartView {

	public static void main(String[] args) {
		BTController controller = BTController.getInstance();

		System.out.println("=====모든 프로젝트 검색=====");
		controller.allBTProjects();

		System.out.println("=====특정 프로젝트 검색====");
		controller.btProjectGetByName("A-");

		System.out.println("=====새로운 프로젝트 저장 로직====");
//		controller.insertBTProject(new BTProjectDTO("AB-", "bt4", "donor4", "recipient4", "AB-형간의 수혈"));
		controller.allBTProjects();

		System.out.println("=====특정 프로젝트 업데이트====");
//		controller.updateProject("AB-", "수정됨");

		System.out.println("=====특정 프로젝트 삭제====");
		controller.deleteProject("AB-");
	}
}
