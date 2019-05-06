package de.dpunkt;

import de.dpunkt.Campaign;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


@SessionScoped
@Named
public class ListCampaignsController implements Serializable {
	
	private static final long serialVersionUID = 8693277383648025822L;
	
	public String doAddCampaign() {
		System.out.println("AddCampaing");
		return Pages.EDIT_CAMPAIGN;
	}
	
	public String doEditCampaign(Campaign campaign) {
		System.out.println("EditCampaign" + campaign);
		return Pages.EDIT_CAMPAIGN;
	}
	
	public String doEditDonationForm(Campaign campaign) {
		System.out.println("Edit Donation Form of Campaign" + campaign);
		return Pages.EDIT_DONATION_FORM;
	}
	
	public String doListDonations(Campaign campaign) {
		System.out.println("List Donations of Campaign" +campaign);
		return Pages.LIST_DONATIONS;
	}
	
	public void doDeleteCampaign(Campaign campaign) {
		System.out.println("Deletion not implemented, yet!");
	}

}
