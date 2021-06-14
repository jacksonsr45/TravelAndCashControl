package jacksonsr45.main.infrastructure.repository;

import domain.gateway.SectionInterface;
import domain.responses.SectionResponse;

public class SectionRepository implements SectionInterface {
    @Override
    public SectionResponse login(String id, String userID, Boolean status) {
        return null;
    }

    @Override
    public Boolean logout(String userID, Boolean status) {
        return null;
    }
}
