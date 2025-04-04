package Multithreading_day4_23DEC;

public class Bakery 
{
	 int goodsAvailable=0;
	final int MAX_GOODS_PER_DAY=100;
	int goodsProducedToday=0;
	public synchronized void bakeGood()
	{
		try
		{
			while(goodsAvailable > 0)
			{
				wait();
			}
		
		if(goodsProducedToday<MAX_GOODS_PER_DAY)
		{
			int goodToBake=Math.min(10,MAX_GOODS_PER_DAY - goodsProducedToday);
			goodsAvailable+=goodsProducedToday;
			System.out.println("Baker produced "+goodToBake+"goods.Total Produced tooday "+goodsProducedToday);
			notifyAll();
			} 
		}catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}
			
}
		
	public synchronized void buyGoods(String CustomerName)
	{
		
			try
			{
				while(goodsAvailable==0 && goodsProducedToday < MAX_GOODS_PER_DAY)
				{
					wait();
				}
				if(goodsAvailable>0)
				{
					goodsAvailable--;
					System.out.println(CustomerName+"bought 1 goods left:"+goodsAvailable);
				}
				if(goodsAvailable == 0)
				{
					notifyAll();
				}
				
		}catch(InterruptedException e)
			{
				Thread.currentThread().interrupt();
			}
			
		}
		
	public synchronized boolean isProductionFinished()
	{
		
		return goodsProducedToday >= MAX_GOODS_PER_DAY &&  goodsAvailable==0;
	}

}
