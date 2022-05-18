package day16;

public class Ex09_String_EndWith {

	public static void main(String[] args) {
		/* 다음과 같이 파일 이름이 주어졌을 때 파일 이미지인지 아닌지 구별하는 코드를 작성하세요.
		 * 파일 확장자가 .jpg, .png, .bmp인 경우 이미지로 구별*/
		
		String fileName = "test.txt.jpg";
		//끝에서부터 .을 찾아서
		int index = fileName.lastIndexOf(".");
		// .뒤에 있는 문자열을 가져옴
		System.out.println(index);
		if(index != -1) {
			String endWith = fileName.substring(index);
			switch(endWith) {
			case ".jpg",".bmp",".png" :
				System.out.println(fileName + " 은 이미지 파일입니다.");
			break;
			default :
				System.out.println(fileName + " 은 이미지 파일이 아닙니다.");
			}
		}else {
			System.out.println(fileName + " 은 이미지 파일이 아닙니다.");
		}

		String img[] = {".jpg",".bmp",".png"};
		
		if(index != -1) {
			String endwith = fileName.substring(index);
			int i;
			for(i =0; i<img.length; i++) {
				if(img[i].equals(endwith)) {
					break;				
				}
			}
				if(i < img.length) {
					System.out.println(fileName + " 은 이미지 파일입니다.");
				}
				else {
					System.out.println(fileName + " 은 이미지 파일이 아닙니다.");
				}
			}
		String img2[] = {".jpg",".bmp",".png"};
		int i;
		/* 문자열1.endWith(문자열2) : 문자열1이 문자열2로 끝나는지 알려줌(참/거짓)*/
		for(i = 0; i<img2.length; i++) {
			if(fileName.endsWith(img2[i])) {
				break;
			}
		}
		if(i < img2.length) {
			System.out.println(fileName + " 은 이미지 파일입니다.");
		}else {
			System.out.println(fileName + " 은 이미지 파일이 아닙니다.");
		}
		//substring을 이용하지 않고 이미지 찾기
		int length = fileName.length();
		for(i = 0; i< img2.length; i++) {
			index = fileName.lastIndexOf(img2[i]);
			if(index == length  - img2[i].length()) {
				break;
			}
		}
		if(i < img2.length) {
			System.out.println(fileName + " 은 이미지 파일입니다.");
		}else {
			System.out.println(fileName + " 은 이미지 파일이 아닙니다.");
		}
		}

	}

