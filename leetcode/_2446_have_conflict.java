public class _2446_have_conflict {

     public boolean haveConflict(String[] event1, String[] event2) {

        String start1 = event1[0]  , end1 = event1[1] ;
        String start2 = event2[0]  , end2 = event1[1] ;

        if(end1.compareTo(start2) < 0 || end2.compareTo(start1) < 0){
            return false ;
        }
        return true ;
        
    }
    
}
