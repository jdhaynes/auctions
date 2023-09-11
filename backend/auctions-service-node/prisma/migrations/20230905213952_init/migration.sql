-- CreateEnum
CREATE TYPE "AuctionStatus" AS ENUM ('OPEN', 'FINISHED', 'RESERVE_NOT_MET');

-- CreateTable
CREATE TABLE "Item" (
    "id" TEXT NOT NULL,
    "make" TEXT NOT NULL,
    "model" TEXT NOT NULL,
    "year" INTEGER NOT NULL,
    "colour" TEXT NOT NULL,
    "mileage" INTEGER NOT NULL,
    "imageUrl" TEXT NOT NULL,

    CONSTRAINT "Item_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "Auction" (
    "id" TEXT NOT NULL,
    "reservePrice" BIGINT NOT NULL,
    "seller" TEXT NOT NULL,
    "winner" TEXT,
    "soldAmount" BIGINT,
    "currentHighBid" BIGINT,
    "createdAt" TIMESTAMP(3) NOT NULL,
    "updatedAt" TIMESTAMP(3) NOT NULL,
    "auctionEnd" TIMESTAMP(3) NOT NULL,
    "status" "AuctionStatus" NOT NULL,
    "itemId" TEXT NOT NULL,

    CONSTRAINT "Auction_pkey" PRIMARY KEY ("id")
);

-- CreateIndex
CREATE UNIQUE INDEX "Auction_itemId_key" ON "Auction"("itemId");

-- AddForeignKey
ALTER TABLE "Auction" ADD CONSTRAINT "Auction_itemId_fkey" FOREIGN KEY ("itemId") REFERENCES "Item"("id") ON DELETE RESTRICT ON UPDATE CASCADE;
