package guru.sfg.common.events;

import lombok.NoArgsConstructor;

/**
 * @author Nuno Martins
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
