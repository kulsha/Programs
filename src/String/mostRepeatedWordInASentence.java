package String;

public class mostRepeatedWordInASentence {

	public static void main(String[] args) {			// Most repeated word
		
		String s = "Shashank tree shashank tree shashank is";
		String[] split = s.split(" ");
		int count=0 , maxCount=0;
		String repeat = "";
		
		for(int i=0 ; i<split.length-1 ; i++)
		{
			for(int j=i+1 ; j<split.length ; j++)
			{
				if(split[i].equals(split[j]))
				{
					count++;
				}
			}
			if(count>maxCount)
			{
				maxCount=count;
				repeat=split[i];
			}	
		}
		System.out.println(repeat);

	}

}
