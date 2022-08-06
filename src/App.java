
public class App {
    public static void main(String[] args) throws Exception {

//     BaseLogger[] loggers =new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatebaseLogger(),new ConsoleLogger()
//     };
//    for (BaseLogger logger:loggers){
//         logger.log("log mesajı");
//     }
        CustomerManager customerManager =new CustomerManager(new DatebaseLogger());
        customerManager.add();
    }
}
