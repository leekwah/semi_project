<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<section class="mypage_content">
		<div class="my_main_title_box">
			<h2 class="tit">회원탈퇴</h2>
		</div>
			<hr>
		<div class="my_top_comment">
			고객님께서 회원 탈퇴를 원하신다니 저희 서비스가 많이 부족하고 미흡했나 봅니다.<br>
			불편하셨던 점이나 불만사항을 알려주시면 적극 반영해서 고객님의 불편함을 해결해 드리도록 노력하겠습니다.<br>
			아울러 회원 탈퇴시의 아래 사항을 숙지하시기 바랍니다.<br><br>
		
			회원 탈퇴 시 고객님의 정보는 상품 반품 및 A/S를 위해 전자상거래 등에서의 소비자 보호에 관한 법률에 의거한 4xr 고객정보 보호정책에따라 관리 됩니다.<br>
			탈퇴 시 고객님께서 보유하셨던 마일리지는 모두 삭제되며, 한번 탈퇴한 아이디는 다시 사용 불가능합니다.<br><br>
			회원 탈퇴 시 탈퇴 후 당일 재가입은 불가능합니다.
		</div>
		<hr>
		<form name="outform" id="outform" action="/mypage/memout.php" method="post">
			<input type="hidden" name="mode" value="w">
			<input type="hidden" name="memid" value="lhs1000j">
			<input type="hidden" name="is_social_id" value="N">
			<input type="hidden" name="check1" value="1663305350">
			<input type="hidden" name="check2" value="f7160b0caa3f7e15f5ee5a4e0d6ef9a8">
	<section class="mem_table">
		<table cellpadding="0" cellspacing="0">
			<colgroup>
				<col width="260px">
				<col>
			</colgroup>
		<tbody>
			<tr>
				<th scope="row" class="top"><strong>불편했던 점을 적어주세요 (선택)</strong></th>
				<td class="field2">
					<textarea name="memo" style="height:200px;" placeholder="내용을 입력해주세요"></textarea>
				</td>
			</tr>
			<tr>
				<th scope="row" class="top"><strong>비밀번호 입력</strong></th>
				<td class="field2">
					<input style="width:296px;" type="password" value="" name="passwd" maxlength="20" onkeyup="check_pwd_length(this, 'passwd');">
					<input type="hidden" name="passwd_enc" value="">
				</td>
			</tr>
			<tr>
				<th scope="row" class="top"><strong>비밀번호 확인</strong></th>
				<td class="field2">
				<input style="width:296px;" type="password" value="" name="repasswd" maxlength="20" onkeyup="check_pwd_length(this, 'repasswd');">
				</td>
			</tr>
		</tbody>
	</table>
	</section>
			<div class="withdrawal_btn_box"><hr>
				<div class="agree">
					<label class="checkbox style_01 size"><input type="checkbox" name="is_memout_agreement">
						<span>
							안내사항을 모두 확인하였으며, 이에 동의합니다.
						</span>
					</label>
				</div>
					<a href="main.jsp" class="btn_ty1">취소</a>
					<a href="main.jsp" class="btn_ty2" id="btn_memout_confirm">회원 탈퇴</a>
			</div>
		</form>
	</section>
</body>
</html>