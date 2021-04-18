package com.numerisante.usermgmt.service.utils;

import java.util.UUID;

import com.numerisante.usermgmt.entity.User;

public class Utility {

    private Utility() {
	    throw new IllegalStateException("Utility class");
	 }

	public static String getUUIDString() {
		return UUID.randomUUID().toString();
	}

    public static User setChildIds(final User user) {
		String userId =user.getUserId();
		// for(Address address: order.getAddresses()) {
		// 	address.setAddressId(Utility.getUUIDString());
		// 	address.setOrderId(orderId);
		// }
		// for(Payment payment: order.getPayments()) {
		// 	payment.setPaymentId(Utility.getUUIDString());
		// 	payment.setOrderId(orderId);
		// }for(Item item: order.getItems()) {
		// 	item.setItemId(Utility.getUUIDString());
		// 	item.setOrderId(orderId);
		// }
		return user;
	}
}