/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microservices.sample.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author matia
 */
@JsonTypeName("Product")
@EqualsAndHashCode(of = "id")
@Data
public class Product {
    
    private String id;
    private String name;
    private long price;
    
}