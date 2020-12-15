 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B K n o w l e d g e B a s e ;  
 i m p o r t   h e l a b a s a . H B L e m m a ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n S y n t h e s i z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B N o u n F o r m S c o r i n g A l o g o r i t h m ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . A d m i n L o g i n ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . H B J o i n T e s t e r ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . W e b U t i l s ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 p u b l i c   c l a s s   N o u n C l a s s T e s t   e x t e n d s   H t t p S e r v l e t   {  
  
         / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 9 8 5 4 8 6 8 4 5 9 7 9 2 8 9 6 4 1 L ;  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
 	 	 i f ( A d m i n L o g i n . V e r i f y ( o R e q ,   o R e s ) )  
 	 	 { 	 	  
 	         	 S t r i n g   s L e m m a   =   W e b U t i l s . D e c o d e P a r a m e t e r ( o R e q . g e t P a r a m e t e r ( " t L e m m a " ) ) ;  
 	         	  
 	         	 S t r i n g   s R u l e S e t   =   o R e q . g e t P a r a m e t e r ( " o R u l e S e t " ) ;  
 	         	 s h o r t   i R u l e S e t   =   0 ;  
 	          
 	         	 i f ( s R u l e S e t ! = n u l l )  
 	         	 {  
 	         	 	 i R u l e S e t   =   S h o r t . p a r s e S h o r t ( s R u l e S e t ) ;  
 	         	 }  
 	         	         	  
 	         	 i f ( s L e m m a = = n u l l   | |   i R u l e S e t   = =   0 )  
 	         	 {  
 	         	 	 p r i n t P a g e ( o R e q ,   o R e s ,   0 ,   " " ,   i R u l e S e t ) ;  
 	         	 }      
 	         	 e l s e   i f ( s L e m m a . t r i m ( ) . l e n g t h ( ) = = 0   )  
 	         	 {  
 	         	 	 p r i n t P a g e ( o R e q ,   o R e s ,   1 ,   " " ,   i R u l e S e t ) ;  
 	         	 }  
 	         	 e l s e  
 	         	 { 	         	 	  
 	         	 	 p r i n t P a g e ( o R e q ,   o R e s ,   2 ,   s L e m m a . t r i m ( ) ,   i R u l e S e t ) ;  
 	         	 }  
 	 	 }  
         }  
 	  
  
 	  
         p r i v a t e   v o i d   p r i n t P a g e ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s ,   i n t   i T y p e ,   S t r i n g   s L e m m a ,   s h o r t   i R u l e S e t )   t h r o w s   I O E x c e p t i o n  
         {         	  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 8 " ) ;  
         	  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                 H e l a b a s a . I n i t ( ) ;  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                              
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   N o u n   C l a s s i f i c a t i o n < / t i t l e > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > a   { t e x t - d e c o r a t i o n : n o n e ; } \ n a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } \ n < / s t y l e > \ n < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                  
                 o u t . p r i n t l n ( " < s c r i p t > " ) ;                  
                 o u t . p r i n t l n ( " f u n c t i o n   s e t W o r k i n g P a n e l ( ) { " ) ;  
                 o u t . p r i n t l n ( " v a r   o W o r k i n g s   =   d o c u m e n t . g e t E l e m e n t B y I d ( \ " w o r k i n g s \ " ) ; " ) ;                  
                 o u t . p r i n t l n ( " v a r   o W o r k i n g P a n e l   =   d o c u m e n t . g e t E l e m e n t B y I d ( \ " w o r k i n g _ p a n e l \ " ) ; " ) ;  
                 o u t . p r i n t l n ( " i f ( o W o r k i n g P a n e l ! = n u l l )   {   o W o r k i n g P a n e l . a p p e n d C h i l d ( o W o r k i n g s ) ;   }   } \ n " ) ;                
                 o u t . p r i n t l n ( " w i n d o w . o n l o a d   =   s e t W o r k i n g P a n e l ; " ) ;                                  
                 o u t . p r i n t l n ( " < / s c r i p t > " ) ;  
                                  
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / a d m i n _ p a g e ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / a > < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > N o u n   C l a s s i f i c a t i o n   T e s t   (���  �� �����  ��  �������� )   < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < f o r m   i d = ' f n c o n j '   a c t i o n = ' . / n o u n _ c l a s s _ t e s t '   a l i g n = ' c e n t e r '   m e t h o d = ' g e t ' > " ) ;                  
                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 4 > L e m m a   (����� )   < i n p u t   t y p e = ' t e x t '   n a m e = ' t L e m m a '   v a l u e = ' "   +   s L e m m a   +   " '   s t y l e = ' f o n t - s i z e :   1 4 ' > " ) ;  
                  
                 H B N o u n C o n j u g a t i o n R u l e s   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s ( ) ;  
                  
                 o u t . p r i n t l n ( "   C l a s s   (��� )   :   " +   G e t R u l e S e t E n t r y ( o R u l e s ,   i R u l e S e t ) ) ;  
                 o u t . p r i n t l n ( " < i n p u t   t y p e = ' s u b m i t '   n a m e = ' b E v a l u a t e '   v a l u e = ' E v a l u a t e ' > < / h 4 > < / p > " ) ;  
                  
                 i f ( i T y p e = = 0 )  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > I n p u t   a   S i n h a l a   N o u n   L e m m a   a n d   S e l e c t   a   N o u n   C l a s s   t o   E v a l u a t e ! < / p > " ) ;  
                 	 o u t . p r i n t l n ( " < / f o r m > " ) ;  
                 }  
                 e l s e   i f ( i T y p e = = 1 )  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > G i v e n   w o r d   i s   e m p t y !   I n p u t   a   S i n h a l a   N o u n   L e m m a   t o   E v a l u a t e ! < / p > " ) ;  
                 	 o u t . p r i n t l n ( " < / f o r m > " ) ;  
                 }  
                 e l s e  
                 {  
                 	 H B T r a n s f o r m R u l e S e t   o S e l e c t e d R u l e S e t   =   o R u l e s . G e t R u l e S e t B y I D ( i R u l e S e t ) ;  
                 	  
                 	 P r i n t R e s u l t s T a b l e ( o u t ,   s L e m m a ,   o S e l e c t e d R u l e S e t ) ;  
                 	 o u t . p r i n t l n ( " < h r > < h 4   a l i g n = ' c e n t e r ' > W o r k i n g s < / h 4 > < p   a l i g n = ' c e n t e r '   i d = ' w o r k i n g _ p a n e l '   n a m e = ' w o r k i n g _ p a n e l ' > < / p > < h r > " ) ;                  
                 }                  
                  
                 o u t . p r i n t l n ( A d m i n L o g i n . G e t L o g o u t P a n e l ( o R e q ) ) ;  
                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' > r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;                  
                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;                  
         }  
          
  
          
         p u b l i c   v o i d   P r i n t R e s u l t s T a b l e ( P r i n t W r i t e r   o u t ,   S t r i n g   s L e m m a ,   H B T r a n s f o r m R u l e S e t   o S e l e c t e d R u l e S e t )  
         {  
         	 o u t . p r i n t l n ( " < h r > < p   a l i g n = ' c e n t e r ' > < h 4   a l i g n = ' c e n t e r ' > " + s L e m m a + "  �����  ������� < / h 4 > < / p > " ) ;  
         	 o u t . p r i n t l n ( " < p   i d = ' t e m p _ p a n e l '   n a m e = ' t e m p _ p a n e l ' > < t e x t a r e a   i d = ' w o r k i n g s '   n a m e = ' w o r k i n g s '   c o l s = ' 5 0 '   r o w s = ' 1 4 '   r e a d o n l y > " ) ;  
         	         	  
         	 H B N o u n S c o r i n g A l g o r i t h m   o N o u n S c o r e A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ;  
         	 H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o   =   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ;  
         	  
         	 H B N o u n   o N o u n   =   H B N o u n S y n t h e s i z e r . S y n t h e s i z e N o u n ( s L e m m a ,   o S e l e c t e d R u l e S e t ,   o J o i n S c o r e A l g o ) ;  
  
         	 o N o u n S c o r e A l g o . E v a l u a t e ( o N o u n ) ;  
         	  
         	 i f ( o N o u n ! = n u l l )  
         	 {  
         	 	 o N o u n . D e b u g P r i n t ( ) ;  
         	 }  
         	 / / o u t . p r i n t l n ( " \ ' ; < / s c r i p t > " ) ;  
         	 o u t . p r i n t l n ( " < / t e x t a r e a > " ) ;  
         	  
         	 i f ( o N o u n = = n u l l )  
         	 {  
         	 	 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > < f o n t   c o l o r = ' r e d ' > < h 4   a l i g n = ' c e n t e r ' > F a i l e d   t o   f i n d   a n y   v a l i d   c o n j u g a t i o n   p a t t e r n s ! < / h 4 > < / f o n t > < / p > " ) ;         	 	  
         	 }  
         	 e l s e  
         	 {         	 	  
         	 	 l o n g   l L e m m a I D   =   o N o u n . G e t L e m m a I D ( ) ;  
         	 	  
         	 	 o u t . p r i n t l n ( " < h 5   a l i g n = ' c e n t e r ' > R u l e   S e t   :   " +   o S e l e c t e d R u l e S e t . G e t N a m e ( )   +   "   [ "   +   o S e l e c t e d R u l e S e t . G e t I D ( )   +     " ]   :   S c o r e = "   +   o N o u n . G e t S c o r e ( )   +   " < / h 5 > " ) ;  
         	 	 o u t . p r i n t l n ( " < / f o r m > " ) ;  
         	 	  
         	 	 / / o u t . p r i n t l n ( " < f o r m   i d = ' f e x c e p '   a c t i o n = . / "   +   G e t M a n u a l I n p u t A c t i o n P a g e ( )   +   "   a l i g n = ' c e n t e r '   m e t h o d = ' g e t ' > " ) ;  
         	 	         	 	  
                 	 o u t . p r i n t l n ( " < t a b l e   b o r d e r = 1   a l i g n = ' c e n t e r ' > " ) ;         	  
                 	 o u t . p r i n t l n ( " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > F o r m < / f o n t > < / t d > " ) ;  
                 	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > S i n g u l a r < / f o n t > < / t d > " ) ;  
                 	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > P l u r a l   I n d i s t i n c t < / f o n t > < / t d > " ) ;  
                 	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > P l u r a l   D i s t i n c t < / f o n t > < / t d > < / t r > " ) ;         	  
                 	  
         	 	 P r i n t N o u n ( o u t ,   o N o u n ,   l L e m m a I D ) ;  
         	 	 o u t . p r i n t l n ( " < / t a b l e > " ) ;         	 	  
         	 	 o u t . p r i n t l n ( " < / f o r m > " ) ;   	 	   	 	         	 	         	 	         	 	  
         	 }         	  
         }  
          
         p r o t e c t e d   S t r i n g   G e t R u l e S e t E n t r y ( H B N o u n C o n j u g a t i o n R u l e s   o R u l e s ,   s h o r t   i R u l e S e t )  
         {  
         	 L i s t < H B T r a n s f o r m R u l e S e t >   l i s t R u l e S e t s   =   o R u l e s . G e t R u l e S e t L i s t ( ) ;  
         	  
         	 S t r i n g B u f f e r   s b L i s t   =   n e w   S t r i n g B u f f e r ( ) ;  
         	  
       	 	 s b L i s t . a p p e n d ( " < s e l e c t   i d = ' o R u l e S e t '   n a m e = ' o R u l e S e t '   s t y l e = ' f o n t - s i z e :   1 6 ' > " ) ;  
         	         	  
         	 i n t   i L e n   =   l i s t R u l e S e t s . s i z e ( ) ;  
         	 f o r ( i n t   i = 0 ;   i < i L e n ;   i + + )  
         	 {  
         	 	 H B T r a n s f o r m R u l e S e t   o R S   =   l i s t R u l e S e t s . g e t ( i ) ;  
         	 	 i f ( o R S . G e t I D ( ) = = i R u l e S e t )  
         	 	 {  
         	 	 	 s b L i s t . a p p e n d ( " < o p t i o n   v a l u e = ' "   +   o R S . G e t I D ( )   +   " '   s e l e c t e d > "   +   o R S . G e t N a m e ( )   +   " < / o p t i o n > " ) ;  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 s b L i s t . a p p e n d ( " < o p t i o n   v a l u e = ' "   +   o R S . G e t I D ( )   +   " ' > "   +   o R S . G e t N a m e ( )   +   " < / o p t i o n > " ) ;  
         	 	 }  
         	 }  
         	  
         	 s b L i s t . a p p e n d ( " < / s e l e c t > " ) ;  
         	  
         	 r e t u r n   s b L i s t . t o S t r i n g ( ) ;         	  
         }  
          
         p r i v a t e   v o i d   P r i n t N o u n ( P r i n t W r i t e r   o u t ,   H B N o u n   o N o u n ,   l o n g   l L e m m a I D )  
         {          
         	 S t r i n g   s L e m m a   =   o N o u n . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( ) ;  
         	 o u t . p r i n t l n ( " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' >�� ���� < / f o n t > < / t d > " ) ;    
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 0 ,   0 ) ,   " F 0 0 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 0 ,   1 ) ,   " F 0 1 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 0 ,   2 ) ,   " F 0 2 " ) ;  
         	 o u t . p r i n t l n ( " < / t r > < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' >���� < / f o n t > < / t d > " ) ; 	 	  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 1 ,   0 ) ,   " F 1 0 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 1 ,   1 ) ,   " F 1 1 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 1 ,   2 ) ,   " F 1 2 " ) ;  
         	 o u t . p r i n t l n ( " < / t r > < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' >���� < / f o n t > < / t d > " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 8 ,   0 ) ,   " F 8 0 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 8 ,   1 ) ,   " F 8 1 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 8 ,   2 ) ,   " F 8 2 " ) ; 	  
         	 o u t . p r i n t l n ( " < / t r > " ) ;  
         }  
          
         p r o t e c t e d   v o i d   P r i n t R e s u l t s C e l l ( P r i n t W r i t e r   o u t ,   S t r i n g   s L e m m a ,   l o n g   l L e m m a I D ,   L i s t < H B F o r m >   l i s t F o r m s ,   S t r i n g   s C o n t r o l N a m e )  
         {        
         	 S t r i n g B u f f e r   s b O u t   =   n e w   S t r i n g B u f f e r ( ) ;  
         	 i f ( l i s t F o r m s ! = n u l l )  
         	 {  
 	 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ; 	 	  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s . g e t ( i ) ;  
 	 	 	 	 s b O u t . a p p e n d ( s L e m m a ) ;  
 	 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t M o d i f i e r ( ) ) ;  
 	 	 	 	 s b O u t . a p p e n d ( " = " ) ;  
 	 	 	 	  
 	 	 	 	 i f ( i = = i C o u n t - 1 )  
 	 	 	 	 { 	 	 	 	 	  
 	 	 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t N a t u r a l F o r m ( ) ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 { 	 	 	 	 	  
 	 	 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t N a t u r a l F o r m ( ) ) . a p p e n d ( " ,   " ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 }  
         	 }         	         	  
       	 	 o u t . p r i n t l n ( " < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > " ) ;         	  
         	 o u t . p r i n t l n ( s b O u t . t o S t r i n g ( ) ) ;  
 	 	 o u t . p r i n t l n ( " < / t d > " ) ;         	  
         }        
 }  
