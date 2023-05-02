package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class homework_0425 {
	 public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
    int n = Integer.parseInt(br.readLine());

    Set<String> s = new HashSet<>();

    for ( int i = 0; i < n; i++ ){

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        String name = st.nextToken();
        String status = st.nextToken();


        if (  status.equals("leave") ) {
            s.remove(name);
        } else if ( status.equals("enter")) {
            if ( !s.contains(name) ) {
                s.add(name);
            }
        }
    }
    
    Iterator<String> it = s.iterator();
    	while(it.hasNext()) System.out.println(it.next());

}
}