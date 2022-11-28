module com.example.ecommerceproject {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.ecommerceproject to javafx.fxml;
    exports com.example.ecommerceproject;
}