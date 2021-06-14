package domain.presenter;

import domain.responses.SectionResponse;

public interface SectionPresenterInterface {
    void present(Boolean result);

    void present(SectionResponse response);
}
