$(function() {
	
	
	var form_stock_add = {
		
		/**
		 * 내부 전역변수
		 *
		 * @memberOf form_stock_add
		 */
		v: {},
		c: {},
		f: {},
		
		/**
		 * Event 정의 객체.
		 *
		 * @memberOf form_stock_add
		 */
		event: function() {
			
			// 공장/제품명 셀렉트
			$("#first").on("click", function() {
				//선택한 옵션
				var firstSelected = $("#first").val();
				console.log(firstSelected);
				
				// 옵션 셀렉트 했을시
				if (firstSelected == "공장") {
					$("#prodSelected").hide();
					$("#mfgSelected").show();
				} else {
					$("#mfgSelected").hide();
					$("#prodSelected").show();
				}
			});
			
			
			
			
		},
		/**
		* Init 최초 실행.
		*
		* @memberOf form_stock_add
		*/
		init: function() {
			
			// 이벤트 호출.
			form_stock_add.event();
			
			// select 박스 가리기
			$("#mfgSelected").hide();
			$("#prodSelected").hide();
			
		}
	};
	
	// init 호출.
	form_stock_add.init();
	
	
})