package com.orangehrm.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class JavaUtility {
		
		public int getRandomNum(int range) {
			Random random = new Random();
			int randomNumInRange = random.nextInt(range);
			return randomNumInRange;
		}
		
		public String getCurrentDate(String dateFormat) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			return sdf.format(date);
		}
		
		public String getRequiredDate(int days) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyy");
			sdf.format(date);
			Calendar cal = sdf.getCalendar();
			cal.add(Calendar.DAY_OF_MONTH, days);
			String requiredDate = sdf.format(cal.getTime());
			return requiredDate;
		}
		
		public String getRandomValue() {
			UUID randomData = UUID.randomUUID();
			String value = randomData.toString().replaceAll("[^a-zA-Z]", "");
			return value;
		}

}
