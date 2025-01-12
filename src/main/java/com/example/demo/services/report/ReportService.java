package com.example.demo.services.report;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Facture;
import com.example.demo.entity.Reservation;

@Service
public interface ReportService {
	List<Reservation> getReservationsForPeriod(LocalDate startDate, LocalDate endDate);
	
	List<Facture> getFacturesForPeriod(LocalDate startDate, LocalDate endDate);
	
	Double getTotalRevenue(LocalDate startDate, LocalDate endDate);
	
	 Map<String, Double> getReservationStatusPercentages();

}
