-- DropForeignKey
ALTER TABLE "Auction" DROP CONSTRAINT "Auction_itemId_fkey";

-- AddForeignKey
ALTER TABLE "Auction" ADD CONSTRAINT "Auction_itemId_fkey" FOREIGN KEY ("itemId") REFERENCES "Item"("id") ON DELETE CASCADE ON UPDATE CASCADE;
