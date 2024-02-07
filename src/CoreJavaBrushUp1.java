import java.util.ArrayList;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num=5;
		//String name="foofoo";
		//System.out.println(num+" is "+name+"'s fav no.");
		
		//int[] arr=new int{5];
		//int[] arr1={1,2,3,4,5};
		
		
		//Arrays- new --assigns memory
//		int[] arr = new int[5];
//		arr[0]=4;
//		arr[1]=6;
//		arr[2]=9;
//		arr[3]=12;
//		arr[4]=21;
//		
		//System.out.println(arr[1]);
		
		//for loop
		//for(int i=0; i<arr.length; i++)
//		{
//			//System.out.println(arr[i]);
//		}
//		
//		String[] name= {"mahima","shambharkar"};
//		for (int i=0; i<name.length; i++)
//		{
//			System.out.println(name[i]);
//		}
//		for(String s:name)
//		{
//			System.out.println(s);
//		}
		
		
//		int arr[]= {1,2,3,4,5,6,7,8,9,10};
//		for(int i=0; i<arr.length; i++)
//		{
//			if (arr[i]%2==0)
//			System.out.println(arr[i]);
//			
//			else
//				System.out.println("no id odd");
//		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("mahima");
		a.add("shambharkar");
		a.add("boobas");
		a.remove("boobas");
//		System.out.println(a.get(1));
		
//		for(int i=0; i<a.size(); i++)
//		{
//			System.out.println(a.get(i));
//		}
//		
//		for( String val :a)
//		{
//			System.out.println(val);
//		}
		System.out.println(a.contains("mahima"));
	}

}
