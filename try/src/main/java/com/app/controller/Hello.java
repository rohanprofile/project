package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ArrayDto;
import com.app.dto.ResponseDto;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:3000")
public class Hello {




	// user signup to check if email exist.
	@GetMapping("/test")
	public ResponseEntity<?> test(@RequestBody ArrayDto array) {
		ResponseDto res=new ResponseDto();
		
		System.out.println("aya"+array);
		for(int i=0;i<array.getStr().size();i++) {
			try {
			int a=Integer.parseInt(array.getStr().get(i));
			res.getArr().add(a);
			
			}
			catch (Exception e) {
				// TODO: handle exception
				res.getStr().add(array.getStr().get(i));
			}
			
		}
		res.setPrn("220340120157");
		res.setCcppid("ccpp");
		
	
		return new ResponseEntity<>(res, HttpStatus.OK);

	}

//	// user signup after email confirmed
//	@PostMapping("/signup2")
//	public ResponseEntity<?> signUp(@RequestBody @Valid PatientSignUpRequest request) {
//		System.out.println("in user signup ");
//		try {
//			return ResponseEntity.ok(new ApiResponse(patientService.signUp(request)));
//		} catch (RuntimeException e) {
//			System.out.println("err in add emp " + e);
//			return new ResponseEntity<>(new ApiResponse("Invalid Credentials"), HttpStatus.BAD_REQUEST);
//		}
//	}
//
//	// to get profile for user. user-id is passed in url path
//	@GetMapping("/profile/{id}")
//	public ProfileDTO patientProfile(@PathVariable long id) {
//		System.out.println("in patient profile ");
//		System.out.println(patientService.showProfile(id));
//		return patientService.showProfile(id);
//	}
//
//	// to change user password
//	@PutMapping("/profile/changePassword/{id}")
//	public ResponseEntity<?> changePassword(@RequestBody ChangePasswordDTO pcp, @PathVariable long id) {
//		System.out.println("in  controller change password");
//		try {
//			patientService.changePassword(id, pcp.getOldPassword(), pcp.getNewPassword());
//			return new ResponseEntity<>(new ApiResponse("pasword changed successfully"), HttpStatus.OK);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return new ResponseEntity<>(new ApiResponse("Invalid old password"), HttpStatus.BAD_REQUEST);
//		}
//	}
//
//	// to delete account
//	@PutMapping("/profile/delete/{id}")
//	public ResponseEntity<?> deletePatient(@PathVariable long id) {
//		System.out.println("in delete user ");
//		patientService.deleteUser(id);
//		return new ResponseEntity<>(new ApiResponse("user deleted successfully"), HttpStatus.OK);
//	}
//
//	@GetMapping("/ordermed")
//	public ResponseEntity<?> getMedicineList(@RequestParam String name) {
//		System.out.println(name);
//		ArrayList<Medicine> medList = medService.findByMedicineName(name);
//		System.out.println(medList);
//		return new ResponseEntity<>(medList, HttpStatus.OK);
//	}
//
//	@PostMapping("/order/{id}")
//	public ResponseEntity<?> checkOutOrder(@PathVariable long id,
//			@RequestBody ArrayList<OrderMedicineRequestDTO> orderList) {
//		System.out.println(orderList);
//		Order order = orderService.saveOrderDetails(id, orderList);
//		OrderMedicineResponseDTO omrsd = orderService.fetchOMRSD(order);
//
//		return new ResponseEntity<>(omrsd, HttpStatus.OK);
//	}
//
//	@PostMapping("/payment/{id}")
//	public ResponseEntity<?> paymentProcessing(@PathVariable long id, @RequestBody PaymentProcessingDto paymentDto) {
//		System.out.println("In payment Processing " + paymentDto);
//		OrderMedicineResponseDTO omrsd = orderService.paymentUpdateDetails(paymentDto, id);
//		System.out.println(omrsd);
//		return new ResponseEntity<>(omrsd, HttpStatus.OK);
//	}
//
//	@PutMapping("/walletRecharge/{id}")
//	public ResponseEntity<?> recharge(@PathVariable long id, @RequestBody WalletRechargeDTO rec) {
//		System.out.println("in wallet reacharge" + id + " " + rec);
//		try {
//			patientService.walletRecharge(id, rec.getAmt());
//			return new ResponseEntity<>(new ApiResponse("amount updated successfully"), HttpStatus.OK);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return new ResponseEntity<>(new ApiResponse("transaction failed"), HttpStatus.BAD_REQUEST);
//		}
//	}
//
//	@GetMapping("/orderhistory/{id}")
//	public ResponseEntity<?> fetchOrderList(@PathVariable long id) {
//		System.out.println(orderService.fetchOrderlist(id) + " in controller fetch orderlist");
//		return new ResponseEntity<>(orderService.fetchOrderlist(id), HttpStatus.OK);
//	}
//
//	@GetMapping("/wallet/{id}")
//	public ResponseEntity<?> getWallet(@PathVariable long id) {
//		Patient p = patientService.getWallet(id);
//		return new ResponseEntity<>(p.getWallet(), HttpStatus.OK);
//	}

}

