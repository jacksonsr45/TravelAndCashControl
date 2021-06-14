package domain.gateway;

import domain.responses.SectionResponse;

public interface SectionInterface {
    SectionResponse login(String id, String userID, Boolean status);

    Boolean logout(String userID, Boolean status);
}
