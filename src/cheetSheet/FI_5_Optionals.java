package cheetSheet;

import java.util.Optional;

public class FI_5_Optionals {

    public static void main(String[] args) {
        //optional for name variable
        Optional<String> name = retrieveCustomerName(8463L);

        //ifPresent
        name.ifPresent(x -> System.out.println("Found customer name: " + x));

        //isPresent
        if (name.isPresent()) {
            System.out.println(name.get());
        } else {
            System.out.println("no name found");
        }

        //orElse
        System.out.println(name.orElse("no name found"));
    }

    //retrieveCustomerName
    static Optional<String> retrieveCustomerName(Long id) {
        String customerName = null;//data access code here to retrieve customer name
        return Optional.ofNullable(customerName);
    }
}
