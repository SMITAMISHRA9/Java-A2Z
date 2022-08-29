public class MemoryConverter{
	 
	public static void main(String[] args) {
	
		double size_bytes=74177476D;
		String cnt_size = null;
		
		double size_kb = size_bytes /1024;
		double size_mb = size_kb / 1024;
		double size_gb = size_mb / 1024 ;
		System.out.println("Conversion of Memory:");
	    
	    System.out.println(cnt_size = size_kb + " KB");
	    
	    System.out.println(cnt_size = size_mb + " MB");
	    
	    System.out.println(cnt_size = size_gb + " GB");
	             
				
	}
}