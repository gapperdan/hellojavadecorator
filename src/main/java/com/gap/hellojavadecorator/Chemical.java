package com.gap.hellojavadecorator;

public class Chemical extends HazardDecorator {

	private Parcel parcel;
	
	public Chemical(Parcel parcel) {
		this.parcel = parcel;
	}
	
	@Override
	public String getDescription() {
		return parcel.getDescription() + ":Chemical:";
	}

}
