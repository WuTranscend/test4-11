public class 去重 {

	public static void main(String[] args) {
		String str = "asdfasdfasdf";
		String s="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i); //charAt(int index) 检索特定索引下的字符的String实例方法
			if(s.indexOf(c)==-1) { //返回字符中首次出现的位置，没有则返回-1
				s+=c;
			}
		}
		System.out.println(s);
		
	}

}
