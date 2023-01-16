package Database;

public class IdGenrator {
  
        private static int i =0;
        public static int getId()
        {
            i++;
            return i;
        }
    
}
