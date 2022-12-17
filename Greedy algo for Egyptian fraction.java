public class Main
{
       static void printEgyptian(int nr, int dr){
        if(nr==0||dr==0){
            return;
        }
        if(nr%dr==0){
            System.out.print(nr/dr);
            return;
        }
        if(dr%nr==0){
            System.out.print("1/"+dr/nr);
            return;
        }
        if(nr>dr){
            System.out.print(nr/dr+"+");
            printEgyptian(nr%dr,dr);
            return;
        }
        int gpu=dr/nr+1;
        System.out.print("1/"+gpu+" + ");
        printEgyptian(nr*gpu-dr,dr*gpu);
    }
	public static void main(String[] args) {
		int nr=6; 
		int dr=14;
		printEgyptian(nr,dr);
	}
}
