public class new_switchstatement{
    public static void main(String[]args){
        String day ="Monday";
        String dp="";

        switch(day)
        {
            case "Saturday","sunday"->dp="6am";
            case "Monday"->dp="8am";

            default->dp="7am";
        }
            
            System.out.println(dp);
    }
}