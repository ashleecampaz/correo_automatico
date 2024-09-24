package com.easyconference.domain.service;

import com.easyconference.domain.entities.Conference;
import java.util.List;

public interface IConferenceService {
    public boolean storeConference(Conference objConference);
    public List<Conference> listConference();
}
