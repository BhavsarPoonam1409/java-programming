public class Song{
	String name;
	int duration;
	int yearofrelase;
	String artist;
	String album; 
	
	
	public Song(String n,int d,int yor,String a,String alb){  //constructors
		this.name = n; 
		this.duration =d;
		this.yearofrelase= yor;
		this.artist = a;
		this.album = alb;
		
		}
		
	public static void main(String[] args){
		Song s1 = new Song("Tum se hi",5,2007,"arjitsingh","Jab We Met");
		Song s2 = new Song("Janam Janam",3,2015,"arjitsingh","Dilwale");
		
		System.out.println("***** Song 1 *****");
		System.out.println("song name: "+s1.name);
		System.out.println("song duration: "+s1.duration);
		System.out.println("song yearofrelase: "+s1.yearofrelase);
		System.out.println("song artist: "+s1.artist);
		System.out.println("song album: "+s1.album);
		
		System.out.println("");
		
		System.out.println("***** song 2 *****");
		System.out.println("song name: "+s2.name);
		System.out.println("song duration: "+s2.duration);
		System.out.println("song yearofrelase: "+s2.yearofrelase);
		System.out.println("song artist: "+s2.artist);
		System.out.println("song album: "+s2.album);
	}
}