public class DatebaseLogger extends BaseLogger {
   
    /* (non-Javadoc)
     * @see BaseLogger#log(java.lang.String)
     */
    public void log(String message){
        System.out.println("logged to DataBase : "+ message);
    }
}
