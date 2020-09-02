package guru.sfg.beer.inventory.service.services;

import guru.sfg.brewery.model.BeerOrderDto;

/**
 * @author Nuno Martins
 */
public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
