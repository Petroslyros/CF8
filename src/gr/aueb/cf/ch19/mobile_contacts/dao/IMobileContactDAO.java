package gr.aueb.cf.ch19.mobile_contacts.dao;

import gr.aueb.cf.ch19.mobile_contacts.model.MobileContact;

import java.util.List;
import java.util.Optional;

public interface IMobileContactDAO {
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(long id, MobileContact mobileContact);
    void deleteByID(long id);
    MobileContact getByID(long id);
    List<MobileContact> getALl();

    void deleteByPhoneNumber(String phoneNumber);
    Optional<MobileContact> getByPhoneNumber(String phoneNumber);
    boolean contactIdExists(long id);
    boolean phoneNumberExists(String phoneNumber);
}
