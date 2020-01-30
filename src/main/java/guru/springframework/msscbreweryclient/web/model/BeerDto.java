package guru.springframework.msscbreweryclient.web.model;

import lombok.*;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Value
@Builder(toBuilder= true)
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
