package dicka.web;

import dicka.entities.Hotel;
import dicka.persistence.HotelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ControllerHotel {

    private static Logger LOGGER = LoggerFactory.getLogger(ControllerHotel.class);

    private HotelRepository hotelRepository;

    public ControllerHotel(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @GetMapping(value = "/hotel")
    public ResponseEntity<List<Hotel>>getListHotels(){
        LOGGER.debug("menampilkan data hotel");
        List<Hotel> hotels = hotelRepository.findAll();
        if(hotels.isEmpty()){
            LOGGER.debug("data hotel tidak ada");
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Hotel>>(hotels, HttpStatus.OK);
    }
}
