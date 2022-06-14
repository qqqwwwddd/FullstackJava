package blood.transfusion.view;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;

public class EndView {

	// 특정 프로젝트 출력_
	public static void projectView(BloodTransfusionProject project) {
		System.out.println(project);
	}

	// 모든 프로젝트 출력_
	public static void projectListView(ArrayList<BloodTransfusionProject> allBTProjects) {
//		System.out.println(allBTPrjoects);
		for (int i = 0; i < allBTProjects.size(); i++) {
			System.out.println(allBTProjects.get(i));
		}
	}

	// 예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}

}
