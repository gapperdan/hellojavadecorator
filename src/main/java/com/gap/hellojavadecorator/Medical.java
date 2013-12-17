package com.gap.hellojavadecorator;

public class Medical extends HazardDecorator {

	private Parcel parcel;
	
	public Medical(Parcel parcel) {
		this.parcel = parcel;
	}
	
	@Override
	public String getDescription() {
		return parcel.getDescription() + ":Medical:";
	}

}
