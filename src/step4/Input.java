package step4;

import java.io.*;
import java.util.Scanner;

public class Input {

	private static String File;

	public static void main(String[] args) throws IOException {
			
//		BufferedWriter bw = new BufferedWriter(new FileWriter("./output_board.txt"));
//		FileOutputStream fos = new FileOutputStream(outputPath);
//	    PrintStream ps = new PrintStream(fos);
//		bw.write(File);
		
		File f = new File("./board.txt");
		FileReader reader = new FileReader(f);
		
		Scanner s = new Scanner(f);
		int w = s.nextInt();
		int h = s.nextInt();
		System.out.printf("W = %d, H = %d\n", w, h);
		
		int[][] board = new int[w][h];
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			
			int x3 = s.nextInt();
			int y3 = s.nextInt();
			int x4 = s.nextInt();
			int y4 = s.nextInt();
			
			board[y1][x1] = 1;
			board[y2][x2] = 1;
			
			board[y3][x3] = 1;
			board[y4][x4] = 1;
		}
		
		for(int y = 0; y < board.length; y++) {
			for(int x = 0; x < board.length; x++) {
				System.out.print(board[y][x] + " ");
			}
			System.out.println();
		}
//		bw.close();
	}	
}		
		
		
		
//		try {
//			File file = new File("line.txt");
//			FileReader file_reader = new FileReader(file);
//			int cur = 0;
//			while((cur = file_reader.read()) != -1) {
//				System.out.println((char)cur);
//			}
//			file_reader.close();
//		} catch(FileNotFoundException e) {
//			e.getStackTrace();
//		} catch(IOException e) {
//			e.getStackTrace();
//		}
//		try {
//			String inputPath = "board.txt";
//			
//			String[] board = new String[1];
//						
//			FileReader fr = new FileReader(inputPath);
//			
//			BufferedReader br =  new BufferedReader(fr);
//			String data = "";
//			
//			
//			for(int i = 0; i < board.length; i++) {
//				System.out.println(board[i]);
//				} while ((data = br.readLine()) != null) {
//			       board = data.split(",");
//			    }
//			System.out.println(new String(inputPath));
//			
//		} catch(Exception e) {
//			e.getStackTrace();
//		}
//	}
//
//}
