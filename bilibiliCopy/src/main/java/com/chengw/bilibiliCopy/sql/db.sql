alter table forum change column forumID forum_id varchar(32);
alter table forum change column forumBT forum_bt text;
alter table forum change column forummessage forum_message text;
alter table forum change column forumuserName forum_user_name varchar(32);
alter table forum change column forumTime forum_time varchar(32);
alter table forum change column forumliebie forum_list varchar(32);
alter table forum change column forumAmount forum_amount varchar(5);
alter table forum change column firumhand forum_hand text;

alter table forum_reply change column  replyid reply_id varchar(32);
alter table forum_reply change column  replyneirong reply_content text;
alter table forum_reply change column  replyhand reply_hand varchar(64);
alter table forum_reply change  column replytieziid reply_post_id varchar(32);
alter table forum_reply change column  replyname reply_name varchar(32);

alter table grids change  column gridsID grid_id varchar(64);
alter table grids change  column  girdsName grids_name varchar(64);
alter table grids change  column girdsjiage grid_price varchar(64);
alter table grids change column girdsimg grid_img varchar(64);
alter table grids change column girdskucun grids_stock int(11);

alter table message change column messageID message_id varchar(32);
alter table message change column messagevideoID message_video_id varchar(32);
alter table message change column messageHand message_hand TEXT;
alter table message change column messageTime message_time varchar(32);
alter table message change column messageuserID message_user_id varchar(32);
alter table message change column messageuserName message_user_name varchar(32);

alter table ordertable change column OrderID order_id varchar(32);
  alter table ordertable change column OrderAddr order_addr text;
alter table ordertable change column OrderuserName order_user_name varchar(64);
  alter table ordertable change column OrderIgridsName order_grids_name text;
alter table ordertable change column OrderzongRMB order_overall_price float;
  alter table ordertable change column OrderStat order_status varchar(64);
alter table ordertable change column OrderTime order_time varchar(64);
alter table ordertable change column OrdergridsImg order_grid_image varchar(64);

alter table shopping_cart change column cartID cart_id varchar(64);
  alter table shopping_cart change column userName user_name varchar(64);
alter table shopping_cart change column shoopingID shopping_id varchar(64);
  alter table shopping_cart change column shoopingName shoppping_name varchar(64);
alter table shopping_cart change column shoopingImg shopping_image varchar(64);
  alter table shopping_cart change column shoopingjiage shopping_price varchar(64);

alter table video change column videoAddress vedio_address text
  alter table video change column videocAtegory video_category varchar(32);
alter table video change column videoCollection video_collection text;
  alter table video change column videoID video_id varchar(32);
alter table video change column videoImage video_image text;
  alter table video change column videolookTime video_watch_time varchar(32);
alter table video change column videoLeaving video_leaving text;
  alter table video change column videoState video_status varchar(32);
alter table video change column videoName video_name varchar(160);



alter table  user change column userName user_name varchar(32);
  alter table  user change column userAddress user_address varchar(160);
alter table  user change column userCollection user_collection varchar(160);
  alter table  user change column userEmial user_email varchar(32);
alter table  user change column userIcon user_hand text;
  alter table  user change column userQQ user_qq varchar(32);
alter table  user change column userID user_id varchar(32);
  alter table  user change column passWord password varchar(32);
alter table  user change column userPaypassword user_payment_password varchar(48);
  alter table  user change column usersex sex varchar(10);
alter table  user change column userPhone user_phone varchar(11);
  alter table  user change column useryinghangka user_bank_card varchar(32);
alter table  user change column userState user_status varchar(11);
  alter table  user change column userIP user_ip varchar(32);
alter table  user change column userLoginTime user_login_time timestamp;
  alter table  user change column userRMB user_balance float;
alter table  user change column userMingzi user_real_name varchar(32);


alter table user change column user_id user_id int;

desc user;

alter table forum_reply change column replytime reply_time timestamp;

select user_id,user_name,password,user_email,user_phone ,user_icon from user where user_name = 'veax';

alter table user change column user_hand user_icon varchar(64);

use bilibili;
delete from user where user.user_hand like '%static%';

alter table user change column user_id  user_id int auto_increment;

alter table user auto_increment = 1;



