import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		//읽어들일 수 있는 스트림(원본 파일)과
		//출력 가능한 스트림(새 파일)을 준비한다.
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\Users\\SMART-09\\Desktop\\강아지\\짱절미3.jpg");
			out = new FileOutputStream("C:\\Users\\SMART-09\\Desktop\\copy3.jpg");
	
			while(true) {
				int data = in.read();
				if(data == -1) {
					break;
				}
				out.write(data);
			} //end while
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try { in.close();}catch(Exception e){}
			}
			if(out != null) {
				try { out.close();}catch(Exception e){}
			}
		} //end finally
	} //end main
}
