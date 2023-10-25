package org.example.pythonCallAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class PythonCallAPI {

	public void call(String arg) throws IOException, InterruptedException {
		System.out.println("pythonbuilder ");

		ProcessBuilder builder;
		BufferedReader br;

		//경로를 입력 받는 방식으로 생각해보는게 좋다.
//		arg1 = "/Users/ptk/PycharmProjects/excel/validate_sku_rule_1023.py";
		builder = new ProcessBuilder("python3",arg);

		builder.redirectErrorStream(true);
		Process process = builder.start();

		// 자식 프로세스가 종료될 때까지 기다림
		int exit = process.waitFor();

		//// 서브 프로세스가 출력하는 내용을 받기 위해
		br = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(">>>  " + line); // 표준출력에 쓴다
		}
		if(exit !=0){
			//비정상종료
			System.out.println("비정상종료");
		}
		System.out.println("pythonConnect");
	}
}
