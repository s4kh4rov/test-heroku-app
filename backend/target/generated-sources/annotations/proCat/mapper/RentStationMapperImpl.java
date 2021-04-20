package proCat.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import proCat.dto.RentStationDTO;
import proCat.entity.RentStation;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-20T15:57:29+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class RentStationMapperImpl implements RentStationMapper {

    @Override
    public RentStationDTO toRentStationDTO(RentStation rentStation) {
        if ( rentStation == null ) {
            return null;
        }

        RentStationDTO rentStationDTO = new RentStationDTO();

        rentStationDTO.setStationId( rentStation.getStationId() );
        rentStationDTO.setStationName( rentStation.getStationName() );
        rentStationDTO.setAddress( rentStation.getAddress() );
        rentStationDTO.setLatiitude( rentStation.getLatiitude() );
        rentStationDTO.setLongitude( rentStation.getLongitude() );

        return rentStationDTO;
    }

    @Override
    public List<RentStationDTO> toRentStationDTOs(List<RentStation> rentStation) {
        if ( rentStation == null ) {
            return null;
        }

        List<RentStationDTO> list = new ArrayList<RentStationDTO>( rentStation.size() );
        for ( RentStation rentStation1 : rentStation ) {
            list.add( toRentStationDTO( rentStation1 ) );
        }

        return list;
    }
}
