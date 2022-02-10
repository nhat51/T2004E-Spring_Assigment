package com.example.assigment.loadData;

import com.example.assigment.StreetStatus;
import com.example.assigment.entity.District;
import com.example.assigment.entity.Street;
import com.example.assigment.repository.DistrictRepository;
import com.example.assigment.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class LoadData implements CommandLineRunner {
    @Autowired
    StreetRepository streetRepository;

    @Autowired
    DistrictRepository districtRepository;

    @Override
    public void run(String... args) throws Exception {
            loadDistrict();
            loadStreet();
    }

    private void loadDistrict(){
        if (districtRepository.count() == 0){
            District district1 = new District("Hoang Mai");
            District district2 = new District("Thuong Tin");
            District district3 = new District("Thanh Xuan");
            District district4 = new District("Ba Dinh");
            District district5 = new District("Thanh Tri");
            districtRepository.save(district1);
            districtRepository.save(district2);
            districtRepository.save(district3);
            districtRepository.save(district4);
            districtRepository.save(district5);
        }
        System.out.println(districtRepository.count());
    }
    private void loadStreet(){
        if (streetRepository.count() == 0){
            Street street1 = new Street("Trần Thủ Độ", LocalDate.now(),"Trần Thủ Độ", StreetStatus.USING,1);
            Street street2 = new Street("Hoàng Mai", LocalDate.now(),"Hoàng Mai", StreetStatus.UNDER_CONSTRUCTION,1);
            Street street3 = new Street("Tạ Hiện", LocalDate.now(),"Tạ Hiện", StreetStatus.FIX,2);
            Street street4 = new Street("Hoàng Hoa Thám", LocalDate.now(),"Hoàng Hoa Thám", StreetStatus.USING,2);
            Street street5 = new Street("Trần Đại Nghĩa", LocalDate.now(),"Trần Đại Nghĩa", StreetStatus.UNDER_CONSTRUCTION,3);
            Street street6 = new Street("Trần Hưng Đạo", LocalDate.now(),"Trần Hưng Đạo", StreetStatus.FIX,3);
            Street street7 = new Street("Lê Thánh Tông", LocalDate.now(),"Lê Thánh Tông", StreetStatus.USING,4);
            Street street8 = new Street("Võ Thị Sáu", LocalDate.now(),"Võ Thị Sáu", StreetStatus.USING,4);
            Street street9 = new Street("Nguyễn An Ninh", LocalDate.now(),"Nguyễn An Ninh", StreetStatus.USING,5);
            Street street10 = new Street("Trần Nhật Duật", LocalDate.now(),"Trần Nhật Duật", StreetStatus.USING,5);
            streetRepository.save(street1);
            streetRepository.save(street2);
            streetRepository.save(street3);
            streetRepository.save(street4);
            streetRepository.save(street5);
            streetRepository.save(street6);
            streetRepository.save(street7);
            streetRepository.save(street8);
            streetRepository.save(street9);
            streetRepository.save(street10);
        }
        System.out.println(streetRepository.count());
    }
}
