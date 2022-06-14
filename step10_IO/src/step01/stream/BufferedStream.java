package step01.stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class BufferedStream {

	public static void main(String[] args) throws FileNotFoundException {

		// Buffer(8192) : 입력 혹은 출력에 대한 임시 저장공간 -> 데이터를 한번에 처리하는 보조 스트림
		// FileWriter - BufferedWriter
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("cheerup.txt"));
//			bw.write("여러분" + "\n");
//			bw.write("집가고싶다" + "\n");
//
//			bw.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// BufferedReader
		try {
			BufferedReader br = new BufferedReader(new FileReader("cheerup.txt"));

			String msg;
			try {
				while ((msg = br.readLine()) != null) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Buffered 보조 스트림 성능 차이 실습
		long startTime;
		long endTime;

		// buffer 미사용
		try {
			FileInputStream fis = new FileInputStream("dog.jpg");

			startTime = System.currentTimeMillis();

			while (fis.read() != -1) {
			}
			endTime = System.currentTimeMillis();

			System.out.println("미사용 :" + (endTime - startTime) + "ms");

			fis.close();

			// 사용
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("dog.jpg"));
			startTime = System.currentTimeMillis();
			while (bis.read() != -1) {
			}
			endTime = System.currentTimeMillis();

			System.out.println("미사용 : " + (endTime - startTime) + "ms");

			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}