package com.diegoesc.springboot.app.springbootdi;

import com.diegoesc.springboot.app.springbootdi.models.domain.ItemBill;
import com.diegoesc.springboot.app.springbootdi.models.domain.Product;
import com.diegoesc.springboot.app.springbootdi.models.service.IService;
import com.diegoesc.springboot.app.springbootdi.models.service.myComplexService;
import com.diegoesc.springboot.app.springbootdi.models.service.myService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("mySimpleService")
    @Primary
    public IService registerMyService(){
        return new myService();
    }

    @Bean("myComplexService")
    public IService registerMyComplexService(){
        return new myComplexService();
    }

    @Bean("ItemsBill")
    public List<ItemBill> registerItems(){
        Product product1 = new Product("Camera Sony", 250);
        Product product2 = new Product("USB Kingstone", 5);
        Product product3 = new Product("EchoDot 3",10);

        ItemBill line1 = new ItemBill(product1, 2);
        ItemBill line2 = new ItemBill(product2, 7);
        ItemBill line3 = new ItemBill(product3, 4);

        return Arrays.asList(line1,line2,line3);
    }

    @Bean("officeItemsBill")
    public List<ItemBill> registerOfficeItems(){
        Product product1 = new Product("Paper packages", 10);
        Product product2 = new Product("Pens", 1);
        Product product3 = new Product("Webcams",20);
        Product product4 = new Product("Printer",60);

        ItemBill line1 = new ItemBill(product1, 100);
        ItemBill line2 = new ItemBill(product2, 200);
        ItemBill line3 = new ItemBill(product3, 8);
        ItemBill line4 = new ItemBill(product4, 2);

        return Arrays.asList(line1,line2,line3,line4);
    }
}
