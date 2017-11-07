package dicka.persistence;

import dicka.entities.Hotel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DBseeder implements CommandLineRunner{

    private HotelRepository hotelRepository;

    public DBseeder(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Hotel pramuka = new Hotel("Pramuka", 5, true);
        Hotel Marriot = new Hotel("Marriot", 5, true);
        Hotel Bandung = new Hotel("Bandung", 8, false);

        List<Hotel> listhotels = new ArrayList<Hotel>();
        listhotels.add(pramuka);
        listhotels.add(Marriot);
        listhotels.add(Bandung);

        this.hotelRepository.save(listhotels);
    }
}
