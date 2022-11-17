package com.nidonoga.utils;

import com.nidonoga.exception.UnsuportedMathOperationException;

public class NumberUtils {

	public static void validateParams(String numberOne, String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new UnsuportedMathOperationException("Please set a numeric value!");
	}

	public static void validateParams(String numberOne) {
		if (!isNumeric(numberOne))
			throw new UnsuportedMathOperationException("Please set a numeric value!");
	}

	public static Double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;

		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number))
			return Double.parseDouble(number);

		return 0D;
	}

	private static boolean isNumeric(String strNumber) {
		if (strNumber == null)
			return false;

		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

}
