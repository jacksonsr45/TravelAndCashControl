package jacksonsr45.main.user_interface.presenter;

import domain.presenter.SectionPresenterInterface;
import domain.responses.SectionResponse;

public class SectionPresenter implements SectionPresenterInterface {
    private SectionResponse section;
    private Boolean result;

    @Override
    public void present(Boolean result) {
        this.result = result;
    }

    @Override
    public void present(SectionResponse response) {
        this.section = response;
    }

    public SectionResponse getSection() {
        return section;
    }

    public Boolean getResult() {
        return result;
    }
}
