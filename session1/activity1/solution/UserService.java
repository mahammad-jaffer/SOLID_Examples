public class UserService implements IEcommerce {
   @Override
   public String addItemToCart(Item item){
       return null;
   }
   
   @Override
   public String DeleteItemFromCart(Item item){
       return null;
   };
 
   @Override
   public String UpdateItemInCart(Item item){
       return null;
   };
   
   @Override
   public  String createOrder(String username, List<Item> items, Address ShippingAddress ){
       return null;
   };
 
   @Override
   public  String trackOrderStatus(String orderId){
       return null;
   };
  
   @Override
   public  String makePayment(String orderId){
       return null;
   };
 
   @Override
   public  String createUserAcount(String name, String address, String age, String phonenum){
       UserRepository userRepo = new UserRepository();
       EmailService emailservice = new emailService( Some credentials );
       //Implementation Logic
       ...
       userRepo.save(Some object params);
       emailservice.sendmail(some object params);
       ...
       return "Some Response String";
   };
}
