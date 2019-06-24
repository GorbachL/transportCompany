package dao;

import entity.Category;
import entity.Transport;

import java.util.List;

public interface TransportDao {

    List<Transport> getTransportByCategory(Category category);
    List<Transport> getTransportCapacityPeople(int capacityPeople);
    List<Transport> getTransportCapacityCargo(int capacityCargo);
    List<Transport> getTransportLessPrice (int price);
    List<Transport> getFasterTransport (int speed);
    List<Transport> get();

}
