package de.dpunkt;

import de.dpunkt.CampaignListProducer;
import de.dpunkt.CampaignProducer;
import javax.enterprise.context.*;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class EditCampaignController implements Serializable {
	
	private static final long serialVersionUID = 2815796004558360299L;
	
	@Inject
	private CampaignListProducer campaignListProducer;
	@Inject
	private CampaignProducer campaignProducer;
	
	public String doSave() {
		if(campaignProducer.isAddMode()) {
			campaignListProducer.getCampaigns().add(campaignProducer.getSelectedCampaign());
		}
	
	return Pages.LIST_CAMPAIGNS;
	}
	public String doCancel() {
		return Pages.LIST_CAMPAIGNS;
}
}
